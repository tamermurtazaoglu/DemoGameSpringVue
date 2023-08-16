<template>

<div class="container">
  <div class="form">
    <div class="step">
      <div class="logo-container">
        <img src="../assets/images/logo.png" alt="Logo">
      </div>
      <h2>The Game</h2>
      <p>Welcome to the game. It's supernatural!</p>
      <p>'cause you can gain many points!</p>
      <button class="next-btn next colorful-btn">Let's start!</button>
    </div>
    <div class="step">
      <h2>List of players</h2>
      <button id="show-records">Show players</button>
      <div id="players">
        <div class="player">
          <p>Player1
            &nbsp;<i class="fa-solid fa-trash delete"></i> 
            &nbsp;<i class="fa-solid fa-pen-to-square "></i>
            &nbsp;<i class="fa-solid fa-gamepad pink playgame next"></i> 

          </p>
        </div>
        <div class="player">
          <p>Player2
            &nbsp;<i class="fa-solid fa-trash delete"></i> 
            &nbsp;<i class="fa-solid fa-pen-to-square"></i>
            &nbsp;<i class="fa-solid fa-gamepad pink playgame next"></i> 
          </p>
        </div>
      </div>

      <button id="add-player" class="colorful-btn">Add player</button>
      
        <div class="modal" id="modal">
          <div class="modal-content" id="player-form">
            <span class="close-btn" id="close-btn"><i class="fa-solid fa-close"></i> </span>
            <form action="">
            
                <label for="name">Name:</label>
                <input type="text" id="name" name="name"><br><br>
                
                <label for="surname">Surname:</label>
                <input type="text" id="surname" name="surname"><br><br>
                
                <label for="gender">Gender:</label>
                <select id="gender" name="gender">
                  <option value="male">Male</option>
                  <option value="female">Female</option>
                </select><br><br>
                
                <label for="birthdate">Birth Date:</label>
                <input type="date" id="birthdate" name="birthdate"><br><br>
                
                <label for="birthcity">Birth City:</label>
                <select id="birthcity" name="birthcity">
                  <option value="city1">Istanbul</option>
                  <option value="city2">Amsterdam</option>
                </select><br><br>

              </form>

              <button class="next-btn colorful-btn" id="add-and-play-btn">Add and play</button>



            <!-- <button>Save</button> -->
          </div>
        </div>

      <button class="prev-btn">Previous</button>
      <!-- <button class="next-btn">Next</button> -->
    </div>
    <div class="step">
      <h2>Gain!</h2>
      <p>Last step is the most enjoy step! Gain points!</p>
      <p class="pink"><b>Score: <span id="score"></span></b></p>
      <button class="block get-10-points" style="font-weight: bold;" >Gain 10 points!</button>
      <div class="bottom">
        <button class="prev-btn">Previous</button>
        <button class="submit-btn colorful-btn">Submit</button>
      </div>
      
    </div>
  </div>
</div>

</template>

