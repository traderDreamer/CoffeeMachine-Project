class Clock {
//https://hyperskill.org/learn/topic/116
    int hours = 12;
    int minutes = 0;

    void next() {

        if (this.minutes == 59 ) {
            if (this.hours == 12) {
                this.hours = 0;
            }
            this.hours++;
            this.minutes = 0;
        } else {

            minutes++;
        }
        // implement me
    }
}