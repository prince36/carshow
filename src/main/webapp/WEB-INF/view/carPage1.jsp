<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Ja
  Date: 17.07.2017
  Time: 17:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <title>Bootswatch: Sandstone</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <link href="/resources/css/bootstrap.min.css" rel="stylesheet" >
    <link rel="stylesheet" href="/resources/css/custom.min.css">
    <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
    <script src="../bower_components/html5shiv/dist/html5shiv.js"></script>
    <script src="../bower_components/respond/dest/respond.min.js"></script>
    <![endif]-->

</head>
<body>

<jsp:include page="module/nevbar.jsp" />

    <div class="container page-header" id="banner">
        <div class="jumbotron">
            <h1>${car1.brand} ${car1.model}</h1>
        </div>
        <div class="row">
            <div class="col-md-6">
                <c:if test="${not empty car1.offer_from}">
                    <label class="col-sm-5 col-form-label">Oferta od: </label><p>${car1.offer_from}</p>
                </c:if>
                <c:if test="${not empty car1.category}">
                    <label class="col-sm-5 col-form-label">Kategoria: </label><p>${car1.category}</p>
                </c:if>
                <c:if test="${not empty car1.brand}">
                    <label class="col-sm-5 col-form-label">Marka: </label><p>${car1.brand}</p>
                </c:if>
                <c:if test="${not empty car1.model}">
                    <label class="col-sm-5 col-form-label">Model: </label><p>${car1.model}</p>
                </c:if>
                <c:if test="${not empty car1.model_version}">
                    <label class="col-sm-5 col-form-label">Wersja: </label><p>${car1.model_version}</p>
                </c:if>
                <c:if test="${not empty car1.year_production}">
                    <label class="col-sm-5 col-form-label">Rok prod.: </label><p>${car1.year_production}</p>
                </c:if>
                <c:if test="${not empty car1.course}">
                    <label class="col-sm-5 col-form-label">Liczba km: </label><p>${car1.course}</p>
                </c:if>
                <c:if test="${not empty car1.fuel}">
                    <label class="col-sm-5 col-form-label">Paliwo: </label><p>${car1.fuel}</p>
                </c:if>
                <c:if test="${not empty car1.power}">
                    <label class="col-sm-5 col-form-label">Moc: </label><p>${car1.power} km</p>
                </c:if>
                <c:if test="${not empty car1.price}">
                    <label class="col-sm-5 col-form-label">Cena: </label><p>${car1.price} zł</p>
                </c:if>
            </div>

            <div class="col-md-6">
                <c:if test="${not empty car1.engine_cap}">
                <label class="col-sm-5 col-form-label">Pojemność silnika: </label><p>${car1.engine_cap}</p>
                </c:if>
                <c:if test="${not empty car1.vin}">
                    <label class="col-sm-5 col-form-label">VIN: </label><p>${car1.vin}</p>
                </c:if>
                <c:if test="${not empty car1.transmission}">
                    <label class="col-sm-5 col-form-label">Skrzynia biegów: </label><p>${car1.transmission}</p>
                </c:if>
                <c:if test="${not empty car1.num_seats}">
                    <label class="col-sm-5 col-form-label">Liczba miejsc: </label><p>${car1.num_seats}</p>
                </c:if>
                <c:if test="${not empty car1.num_doors}">
                    <label class="col-sm-5 col-form-label">Liczba drzwi: </label><p>${car1.num_doors}</p>
                </c:if>
                <c:if test="${not empty car1.color}">
                    <label class="col-sm-5 col-form-label">Kolor: </label><p>${car1.color}</p>
                </c:if>
                <c:if test="${not empty car1.metallic}">
                    <label class="col-sm-5 col-form-label">Metalic: </label><p>${car1.metallic}</p>
                </c:if>
                <c:if test="${not empty car1.country_of_origin}">
                    <label class="col-sm-5 col-form-label">Kraj pochodzenia: </label><p>${car1.country_of_origin}</p>
                </c:if>
                <c:if test="${not empty  car1.first_registration}">
                    <label class="col-sm-5 col-form-label">Pierwsza rejestracja: </label><p>${car1.first_registration}</p>
                </c:if>
                <c:if test="${not empty car1.registr_in_pl}">
                    <label class="col-sm-5 col-form-label">Zarejestrowany w pl: </label><p>${car1.registr_in_pl}</p>
                </c:if>
                <c:if test="${not empty car1.first_owner}">
                    <label class="col-sm-5 col-form-label">Pierwszy właściciel: </label><p>${car1.first_owner}</p>
                </c:if>
                <c:if test="${not empty car1.no_accidents}">
                    <label class="col-sm-5 col-form-label">Bezwypadkowy: </label><p>${car1.no_accidents}</p>
                </c:if>
                <c:if test="${not empty car1.aso}">
                    <label class="col-sm-5 col-form-label">ASO: </label><p>${car1.aso}</p>
                </c:if>
                <c:if test="${not empty car1.date_create}">
                    <label class="col-sm-5 col-form-label">Data utworzenia: </label><p>${car1.date_create}</p>
                </c:if>
            </div>
        </div>

        <form class="form-horizontal">
                <div class="form-group">
                    <div class="col-lg-10 col-lg-offset-2">
                        <button type="reset" class="btn btn-xs btn-warning">Edytuj</button>

                        <button type="submit" class="btn btn-xs btn-danger">Usuń</button>
                    </div>
                </div>
            </fieldset>
        </form>


<jsp:include page="module/footer.jsp" />
    </div>



<script src="https://code.jquery.com/jquery-1.10.2.min.js"></script>
<script src="/resources/js/bootstrap.min.js"></script>
<script src="/resources/js/custom.js"></script>
</body>
</html>