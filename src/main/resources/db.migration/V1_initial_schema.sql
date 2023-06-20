create table initial_url
(
    id bigserial primary key,
    url text not null unique
);

create table shortened_link
(
    id bigserial primary key,
    shortened_url text not null unique,
    initial_url_id bigint not null references initial_url
);

