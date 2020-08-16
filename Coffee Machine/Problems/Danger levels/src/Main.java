enum DangerLevel {
    LOW,
    MEDIUM,
    HIGH;

    int getLevel() {

        return this.ordinal()+1;
    }
}

/**
 *
 * DangerLevel.
 *
 * Add an integer field to store danger levels and match the number with each constant:
 *
 *     HIGH — 3
 *     MEDIUM — 2
 *     LOW — 1
 *
 * You should also add the instance method getLevel that returns the associated
 * integer number.
 *
 * After your modifications, the following code should be compiled and work correctly:
 *
 * DangerLevel high = DangerLevel.HIGH;
 * DangerLevel medium = DangerLevel.MEDIUM;
 *
 * System.out.println(high.getLevel() > medium.getLevel()); // true
 *
 */

