create table initial_link
(
    id bigserial primary key,
    full_url text not null unique
);

create table shortened_link
(
    id bigserial primary key,
    shortened_url text not null unique,
    initial_url_id bigint references initial_link(id) on delete cascade
);

insert into initial_link (id, full_url)
values (default, 'onliner1298912839012.com'),
       (default, 'vkontakte781298127.com'),
       (default, 'odnoklassniki2189182.com');

insert into shortened_link(id, shortened_url, initial_url_id)
values (default, '1', 1),
       (default, '2', 2),
       (default, '3', 3);

select
full_url
from initial_link
where id = ?;

select
    shortened_url
from shortened_link
where initial_url_id = ?;

select
    initial_link.full_url,
    initial_link.id,
    shortened_url,
    initial_url_id
from initial_link
join shortened_link iu on initial_link.id = iu.initial_url_id;


