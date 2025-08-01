<?php

class Lasagna
{
    public function expectedCookTime()
    {
        // Implement the expectedCookTime method
        return 40;
    }

    public function remainingCookTime($elapsed_minutes)
    {
        // Implement the remainingCookTime method
        $timeExpected = $this->expectedCookTime();
        return $timeExpected - $elapsed_minutes;
    }

    public function totalPreparationTime($layers_to_prep)
    {
        // Implement the totalPreparationTime method
        return $layers_to_prep * 2;
    }

    public function totalElapsedTime($layers_to_prep, $elapsed_minutes)
    {
        // Implement the totalElapsedTime method
        $layers = $this->totalPreparationTime($layers_to_prep);
        return $elapsed_minutes+$layers;
    }

    public function alarm()
    {
        // Implement the alarm method
        return "Ding!";
    }
}
