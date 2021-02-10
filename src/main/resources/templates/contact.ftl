<!DOCTYPE html>
<html lang="fr">
<head>
    <meta charset="UTF-8">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/js/bootstrap.bundle.min.js" integrity="sha384-ygbV9kiqUc6oa4msXn9868pTtWMgiQaeYH7/t7LECLbyPA2x65Kgf80OJFdroafW" crossorigin="anonymous"></script>
    <link href="style.css" rel="stylesheet">
    <title>Prestige-Cab</title>
</head>

<body>
<nav class="navbar navbar-expand-lg  navbar navbar-dark bg-dark">
    <div class="container-fluid">
        <a class="navbar-brand" href="http://localhost:8080/"><img style="width: 50px; height: 50px" src="/images/Prestige-Cab(1).png">  </a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                <li class="nav-item">
                    <a class="nav-link active" aria-current="page" href="http://localhost:8080/">Accueil</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#">Véhicules</a>
                </li>
                <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                        Types de véhicules
                    </a>
                    <ul class="dropdown-menu" aria-labelledby="navbarDropdown">
                        <li><a class="dropdown-item" href="http://localhost:8080/berline">Berline</a></li>
                        <li><a class="dropdown-item" href="http://localhost:8080/utilitaire">Utilitaire</a></li>
                        <li><a class="dropdown-item" href="http://localhost:8080/citadine">Citadine</a></li>
                        <li><a class="dropdown-item" href="http://localhost:8080/monospace">Monospace</a></li>
                        <li><a class="dropdown-item" href="http://localhost:8080/sport">Sport</a></li>
                        <li><a class="dropdown-item" href="http://localhost:8080/suv">4*4 SUV</a></li>
                        <li><a class="dropdown-item" href="#"></a></li>
                    </ul>
                </li>

                <li class="nav-item">
                    <a class="nav-link" href="http://localhost:8080/contact">Contact</a>
                </li>
            </ul>
            <form class="d-flex">
                <ul>
                <li class="nav-item">
                    <a class="nav-link" href="http://localhost:8080/login">Admin</a>
                </li>
                </ul>
            </form>
        </div>
    </div>
</nav>
<br>
<div class="container">
    <h1>Contact</h1>

    <form>

        <div class="form-row">
        <div class="form-group col-md-6">
            <label for="nom"></label>
            <input type="text" class="form-control" id="nom" placeholder="Nom">
        </div>
        </div>
        <div class="form-row">
        <div class="form-group col-md-6">
            <label for="prenom"></label>
            <input type="text" class="form-control" id="prenom" placeholder="Prenom">
        </div>
        </div>
        <div class="form-row">
            <div class="form-group col-md-6">
                <label for="inputEmail4"></label>
                <input type="email" class="form-control" id="inputEmail4" placeholder="Email">
            </div>
        </div>
        <div class="form-row">

            <div class="form-group col-md-4">
                <label for="inputState"></label>
                <select id="inputState" class="form-control">
                    <option selected>Demande</option>
                    <option>Questions</option>
                    <option>Devis</option>
                </select>
            </div>
            <div class="form-group">
                <label for="exampleFormControlTextarea1"></label>
                <textarea class="form-control" id="exampleFormControlTextarea1" placeholder="Decrivez votre demande" rows="3"></textarea>
            </div>
        </div>
        <div class="form-group">
        </div>

        <br>
        <button type="submit" class="btn btn-primary">Envoyer</button>
    </form>

</div>
</body>
</html>