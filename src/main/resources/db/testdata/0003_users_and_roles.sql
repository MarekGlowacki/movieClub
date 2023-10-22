insert into
    users (email, password)
values
    ('admin@example.com', '{noop}adminpasss'),   -- 1
    ('user@example.com', '{noop}userpass'),     -- 2
    ('editor@example.com', '{noop}editorpass'); -- 3

insert into
    user_role (name, description)
values
    ('ADMIN', 'full permissions'),   -- 1
    ('USER', 'basic permissions, ability adding votes'),   -- 2
    ('EDITOR', 'basic permissions + ability managing content');   -- 3

insert into
    user_roles (user_id, role_id)
values
    (1, 1),
    (2, 2),
    (3, 3);