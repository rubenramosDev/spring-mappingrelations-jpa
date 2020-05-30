#Categoria Artiulo
INSERT INTO categoria_articulo (nombre) VALUES ('Categoria uno'), ('Categoria dos');

#
# #Articulo
INSERT INTO articulos (nombre, id_categoria) VALUES ('Articulo uno', 1), ('Articulo dos', 2);
#
# #Estatus pedido
INSERT INTO estatus_pedido (estatus_pedido) VALUES ('Estatus pedido 1'), ('Estatus pedido 2');

# #Usuarios
INSERT INTO usuarios (nombre) VALUES ('Ruben Ramos');
#
# #Pedidos
INSERT INTO pedidos (fecha_fin, fecha_inicio, id_estatus_pedido, id_usuario) VALUES (now(), now(), 1, 1);
#
# #Pedido Artculo
INSERT INTO pedido_articulo(cantidad, precio_unitario, id_articulo, id_pedido) VALUES (3, 50.0, 1, 1);
