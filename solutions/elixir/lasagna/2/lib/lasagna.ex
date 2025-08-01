defmodule Lasagna do
  # Please define the 'expected_minutes_in_oven/0' function
  def expected_minutes_in_oven do
    40
  end;

  # Please define the 'remaining_minutes_in_oven/1' function
  def remaining_minutes_in_oven(minutes_running) do
    expected_time = expected_minutes_in_oven();
    expected_time-minutes_running
  end;

  # Please define the 'preparation_time_in_minutes/1' function
  def preparation_time_in_minutes(n_layers) do
    n_layers*2
  end;

  # Please define the 'total_time_in_minutes/2' function
  def total_time_in_minutes(n_layers, nMinutes) do
    nTimeLayers = preparation_time_in_minutes(n_layers);
    nMinutes+nTimeLayers
  end;

  # Please define the 'alarm/0' function
  def alarm do
    "Ding!"
  end;
end
