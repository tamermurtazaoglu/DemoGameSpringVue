$(document).ready(function() {
    const steps = $('.step');
    const prevBtns = $('.prev-btn');
    const nextBtns = $('.next');
    const submitBtn = $('.submit-btn');
    const restartBtn = $('.restart-btn');
    
    let currentStep = 0;
    
    function updateStep() {
        steps.each(function(index, step) {
            if (index === currentStep) {
                $(step).addClass('active');
            } else {
                $(step).removeClass('active');
            }
        });
    
        if (currentStep === 0) {
            prevBtns.hide();
            
        } else {
            prevBtns.show();
        }
    
        if (currentStep === steps.length - 1) {
            submitBtn.show();
            nextBtns.hide();
        } else {
            submitBtn.hide();
            nextBtns.show();
        }
    }
    
    nextBtns.click(function() {
        currentStep++;
        updateStep();
    });
    
    prevBtns.click(function() {
        currentStep--;
        updateStep();
    });
        
    restartBtn.click(function() {
        currentStep=0;
        updateStep();
    });

    submitBtn.click(function() {
        alert('You are the G.O.A.T!');
    });
    
    updateStep();

    $(".step").addClass("animate__animated animate__pulse");
    $(".logo-container").addClass("animate__animated animate__flipInX");

    $("#players").hide();
    $("#show-records").click(function() { 
        $("#players").show();
        $("#players").addClass("animate__animated animate__flipInX");
        $(this).hide();
        
        
    });

    $("#add-player").click(function() {
        $("#modal").show();
        $("#modal").removeClass("animate__animated animate__fadeIn");
        $("#modal").addClass("animate__animated animate__fadeIn");
      });
    
      $("#close-btn").click(function() {
        $("#modal").hide();

      });

      $("button").hover(function () {
        $(this).addClass('animate__animated animate__pulse');
        }
      ).mouseout(function() { 
        $(this).removeClass('animate__animated animate__pulse');
    })
      
    let score = 0;
    const scoreSpan = $("#score");
    
    $(".get-10-points").click(function() {
        score+=10;
        scoreSpan.text(score);
      });


      $("i").hover(function () {
        $(this).addClass('animate__animated animate__pulse');
        }
      ).mouseout(function() { 
        $(this).removeClass('animate__animated animate__pulse');
        })


    $("#add-and-play-button").click(function (e) { 
        //
    });

      
});
