<jsp:include page="/WEB-INF/jsp/common/header.jsp" />
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<main id="main" class="main">

    <div class="pagetitle">
      <h1>Crear Usuario</h1>
      <nav>
        <ol class="breadcrumb">
          <li class="breadcrumb-item"><a href="index.html">Home</a></li>
          <li class="breadcrumb-item">Crear Usuario</li>
        </ol>
      </nav>
    </div><!-- End Page Title -->

    <section class="section">
      <div class="row justify-content-center">
        <div class="col-lg-6">

          <div class="card">
            <div class="card-body">
              <h5 class="card-title align-center">Ingrese los datos del Usuario</h5>

              <!-- General Form Elements -->
              <form action="save" method="POST">
                <div class="row mb-3">
                  <label for="inputText" class="col-sm-2 col-form-label">Nombres</label>
                  <div class="col-sm-10">
                    <input type="text" class="form-control"  name="firstname">
                  </div>
                </div>
                <div class="row mb-3">
                  <label for="inputText" class="col-sm-2 col-form-label">Apellidos</label>
                  <div class="col-sm-10">
                    <input type="text" class="form-control"  name="lastname" >
                  </div>
                </div>
                <div class="row mb-3">
                  <label for="inputEmail" class="col-sm-2 col-form-label" >Correo</label>
                  <div class="col-sm-10">
                    <input type="email" class="form-control" name="email">
                  </div>
                </div>
                <div class="row mb-3">
                  <label for="inputPassword" class="col-sm-2 col-form-label" >Contraseña</label>
                  <div class="col-sm-10">
                    <input type="password" class="form-control"  name="password" >
                  </div>
                </div>
                <div class="row mb-3">
                  <label for="inputDate" class="col-sm-2 col-form-label">Cumpleaños</label>
                  <div class="col-sm-10">
                    <input type="date" class="form-control" name="birthday">
                  </div>
                </div>
                <div class="row mb-3">
                  <label for="inputText" class="col-sm-2 col-form-label">Ciudad</label>
                  <div class="col-sm-10">
                    <input type="text" class="form-control" name="city">
                  </div>
                </div>
                <div class="row mb-3">
                  <label for="inputText" class="col-sm-2 col-form-label">Dirección</label>
                  <div class="col-sm-10">
                    <input type="text" class="form-control" name="address">
                  </div>
                </div>
                <div class="row mb-3">
                  <label for="inputText" class="col-sm-2 col-form-label">Celular</label>
                  <div class="col-sm-10">
                    <input type="text" class="form-control" name="phone">
                  </div>
                </div>
                
                <div class="row mb-3">
                  <label class="col-sm-2 col-form-label">Estado</label>
                  <div class="col-sm-10">
                    <select name="state" class="form-select" aria-label="Default select example">
                      <option selected >Ingrese un estado</option>
                      <option value="Activo">Activo</option>
                      <option value="No Activo">No Activo</option>
                    </select>
                  </div>
                </div>
                <div class="row mb-3">
                  <label class="col-sm-2 col-form-label">Roll</label>
                  <div class="col-sm-10">
                    <select name="roll" class="form-select" aria-label="Default select example">
                      <option selected>Ingrese un Roll</option>
                      <option value="admin">Admin</option>
                      <option value="User">User</option>
                    </select>
                  </div>
                </div>  
                <div class="row mb-3">
                  <label for="inputNumber" class="col-sm-2 col-form-label">Agregue una foto</label>
                  <div class="col-sm-10">
                    <input class="form-control" type="file" id="formFile" name="">
                  </div>
                </div>
               

                

                <div class="row mb-5">                  
                  <div class="col-sm-15">
                    <button type="submit" value="Guardar" class="btn btn-primary">Guardar</button>
                  </div>
                </div>

              </form><!-- End General Form Elements -->

            </div>
          </div>

        </div>

        
      </div>
    </section>

  </main><!-- End #main -->
 <jsp:include page="/WEB-INF/jsp/common/footer.jsp" />
