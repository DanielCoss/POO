<?php
require_once("car.php");
require_once("account.php");
require_once("uberX.php");
require_once("uberPool.php");

$uberx = New UberX("ZXC123", new Account("Andres Herrea", "AND456"), "Chevrolet", "Spark");

$uberx->printDataCar();

$uberpool = New UberPool("QRW789", new Account("Andrea Herrea", "ANH856"), "Chevrolet", "Spark");

$uberpool->printDataCar();