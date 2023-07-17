package com.bnyro.clock.ui.common

data class ExampleTimer(
    val seconds: Int,
) {
    // Write a getter for formattedTime that returns a String in the format of "HH:MM:SS"
    val formattedTime: String
        get() {
            val hours = seconds / 3600;
            val minutes = (seconds % 3600) / 60;
            val seconds = seconds % 60;

            return "%02d:%02d:%02d".format(hours, minutes, seconds);
        }

    companion object {
        val exampleTimers: List<ExampleTimer>
            get() = listOf<Int>(
                60,
                60 * 2,
                60 * 5,
                60 * 10,
                60 * 13,
                60 * 15,
                60 * 20,
                60 * 30,
                60 * 60,
                60 * 90,
                60 * 120,
            ).map { ExampleTimer(it) }
    }
}
