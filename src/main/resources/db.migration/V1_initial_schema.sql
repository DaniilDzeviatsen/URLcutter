create table link
(
    id        bigserial primary key,
    full_url  text not null unique,
    short_url text not null unique
);



insert into link (id, full_url, short_url)
values (default, '/santehnik-—sverlit-mamashy-muzh-ne-dogadyvaetsa', '1'),
       (default, 'porno365.bond/movie/36137', '1a'),
       (default, 'odnoklassniki2189182.com', '1A');



select full_url, short_url
from link
where id = ?;

select full_url
from link
where short_url = ?;

select short_url
from link
where full_url = ?;

select *
from link;



