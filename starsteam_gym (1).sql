-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 08-12-2016 a las 18:32:05
-- Versión del servidor: 10.1.19-MariaDB
-- Versión de PHP: 5.6.28

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `starsteam_gym`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `aparatos`
--

CREATE TABLE `aparatos` (
  `aparato_id` int(9) NOT NULL,
  `nombre` varchar(30) NOT NULL,
  `fechacompra` varchar(20) NOT NULL,
  `tipoaparato_id` int(9) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `aparatos`
--

INSERT INTO `aparatos` (`aparato_id`, `nombre`, `fechacompra`, `tipoaparato_id`) VALUES
(1, 'PRENSA DE PIERNA', '23-06-16', 1),
(2, 'BANCO PRESS', '29-12-16', 2),
(3, 'BENCH INVERTIDA', '30-06-16', 1),
(4, 'DORSERA', '12-12-16', 7),
(5, 'CAMINADORA', '11-04-16', 8),
(6, 'BICICLETA', '04-03-16', 8),
(7, 'FEMORALES', '30-07-16', 7),
(8, 'BANCO PLANO', '13-12-16', 10),
(9, 'PARALELAS', '12-04-16', 4),
(10, 'COSTURERA PERFORMANCE', '20-08-16', 9);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `clase`
--

CREATE TABLE `clase` (
  `clase_id` int(9) NOT NULL,
  `nombre` varchar(25) NOT NULL,
  `salon_id` int(9) NOT NULL,
  `instructor_id` int(9) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `clase`
--

INSERT INTO `clase` (`clase_id`, `nombre`, `salon_id`, `instructor_id`) VALUES
(1, 'AEROBICS', 1, 1),
(2, 'ZUMBA', 2, 2),
(3, 'CROSSFIT', 3, 3),
(4, 'SPINNING', 4, 4),
(5, 'BODY COMBAT', 5, 5),
(6, 'PILATES', 6, 6),
(7, 'BODY PUMP', 7, 7),
(8, 'CARDIO', 8, 8),
(9, 'YOGA', 9, 9),
(10, 'STEP', 10, 10);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `clientes`
--

CREATE TABLE `clientes` (
  `cliente_id` int(9) NOT NULL,
  `nombre` varchar(50) NOT NULL,
  `apellidos` varchar(50) NOT NULL,
  `direccion` varchar(50) NOT NULL,
  `edad` int(3) NOT NULL,
  `tel` varchar(20) NOT NULL,
  `instructor_id` int(9) NOT NULL,
  `clase_id` int(9) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `clientes`
--

INSERT INTO `clientes` (`cliente_id`, `nombre`, `apellidos`, `direccion`, `edad`, `tel`, `instructor_id`, `clase_id`) VALUES
(1, 'JULIAN', 'HERNANDEZ', 'CALLE FCO RUIZ 876 SAN ANTONIO', 23, '1645234589', 1, 1),
(2, 'OSWALDO ', 'HERNANDEZ', 'CALLE ABASOLO 65 COL. CENTRO ', 26, '8717432083', 2, 2),
(3, 'RACIEL ', 'GOMEZ', 'CALLE PETUNIAS 103 VILLAS DEL BOSQUE', 24, '8717202020', 3, 3),
(4, 'CESAR', 'MUNIZ', 'CALLE SECCION 38 RESIDENCIAL DEL NORTE', 19, '6745786543', 4, 4),
(6, 'GRECIA', 'VARGAS', 'PASEO DEL OLIMPO 105 COL CAMPESTRE LA ROSITA', 25, '12345666', 6, 6),
(7, 'AZUCENA', 'RUBIO', 'DE LAS ROSAS 23 TORREON JARDIN', 26, '6745785678', 7, 7),
(8, 'MARCELA ', 'CASTAÑEDA', 'DALIA 1032 COL DALIAS', 25, '8765342187', 8, 8),
(9, 'ESTEFANIA', 'MEDINA', 'VIA ULISES 940 FRAC ROMA', 21, '1234567', 9, 9),
(10, 'RICARDO', 'OLAGUE', 'AV SAN FELIPE 1994 COL SAN FELIPE', 34, '8743568743', 10, 10),
(11, 'ABEL', 'SOSA', 'jnjknadskjfnasd', 28, '98748923', 2, 3),
(12, 'Abraham', 'Munoz', 'ijgjaklnd', 32, '984753895', 5, 4),
(13, 'CARO', 'HDZ', 'AV HIDALGO', 43, '89734', 4, 4),
(14, 'XOCHITL', 'MANRIQUEZ', 'VIA JABONOSO', 38, '8974982', 1, 5);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `instructor`
--

CREATE TABLE `instructor` (
  `instructor_id` int(9) NOT NULL,
  `nombre` varchar(50) NOT NULL,
  `apellidos` varchar(50) NOT NULL,
  `tel` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `instructor`
--

INSERT INTO `instructor` (`instructor_id`, `nombre`, `apellidos`, `tel`) VALUES
(1, 'Tomas', 'Weimar', '8711121314'),
(2, 'Janio Rubio', 'Soler', '8711121416'),
(3, 'Adriana', 'Monroy', '8712234568'),
(4, 'Rogelio', 'Guerra', '8711131517'),
(5, 'Alba ', 'Palacio', '8798656666'),
(6, 'PercySantos', '', '8123457689'),
(7, 'Jairo', 'Chuma', '8711256478'),
(8, 'Tonny', 'Montana', '6461345627'),
(9, 'Bruno', 'Machado', '6561324563'),
(10, 'Joel ', 'Castañeda', '4435267789');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `salon`
--

CREATE TABLE `salon` (
  `salon_id` int(9) NOT NULL,
  `nombre` varchar(20) NOT NULL,
  `instructor_id` int(9) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `salon`
--

INSERT INTO `salon` (`salon_id`, `nombre`, `instructor_id`) VALUES
(1, 'A', 1),
(2, 'B', 2),
(3, 'C', 3),
(4, 'D', 4),
(5, 'E', 5),
(6, 'F', 6),
(7, 'G', 7),
(8, 'H', 8),
(9, 'I', 9),
(10, 'J', 10);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipo_aparatos`
--

CREATE TABLE `tipo_aparatos` (
  `tipoaparato_id` int(9) NOT NULL,
  `nombre` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `tipo_aparatos`
--

INSERT INTO `tipo_aparatos` (`tipoaparato_id`, `nombre`) VALUES
(1, 'PIERNA'),
(2, 'PECHO'),
(3, 'BICEP'),
(4, 'TRICEP'),
(5, 'HOMBRO'),
(6, 'TRAPECIO'),
(7, 'ESPALDA'),
(8, 'CARDIO'),
(9, 'CHAMORRO'),
(10, 'ABDOMEN');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--

CREATE TABLE `usuarios` (
  `usuario_id` int(9) NOT NULL,
  `usuario` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `usuarios`
--

INSERT INTO `usuarios` (`usuario_id`, `usuario`, `password`) VALUES
(333, 'LUIS TRIANA', '123456.'),
(222, 'CAROLINA HERNANDEZ', '123456.');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `aparatos`
--
ALTER TABLE `aparatos`
  ADD PRIMARY KEY (`aparato_id`);

--
-- Indices de la tabla `clase`
--
ALTER TABLE `clase`
  ADD PRIMARY KEY (`clase_id`);

--
-- Indices de la tabla `clientes`
--
ALTER TABLE `clientes`
  ADD PRIMARY KEY (`cliente_id`);

--
-- Indices de la tabla `instructor`
--
ALTER TABLE `instructor`
  ADD PRIMARY KEY (`instructor_id`);

--
-- Indices de la tabla `salon`
--
ALTER TABLE `salon`
  ADD PRIMARY KEY (`salon_id`);

--
-- Indices de la tabla `tipo_aparatos`
--
ALTER TABLE `tipo_aparatos`
  ADD PRIMARY KEY (`tipoaparato_id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `aparatos`
--
ALTER TABLE `aparatos`
  MODIFY `aparato_id` int(9) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;
--
-- AUTO_INCREMENT de la tabla `clase`
--
ALTER TABLE `clase`
  MODIFY `clase_id` int(9) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;
--
-- AUTO_INCREMENT de la tabla `clientes`
--
ALTER TABLE `clientes`
  MODIFY `cliente_id` int(9) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;
--
-- AUTO_INCREMENT de la tabla `instructor`
--
ALTER TABLE `instructor`
  MODIFY `instructor_id` int(9) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;
--
-- AUTO_INCREMENT de la tabla `salon`
--
ALTER TABLE `salon`
  MODIFY `salon_id` int(9) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;
--
-- AUTO_INCREMENT de la tabla `tipo_aparatos`
--
ALTER TABLE `tipo_aparatos`
  MODIFY `tipoaparato_id` int(9) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
