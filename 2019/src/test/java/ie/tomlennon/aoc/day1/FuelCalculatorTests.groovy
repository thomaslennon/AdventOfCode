package ie.tomlennon.aoc.day1;

class FuelCalculatorTests extends spock.lang.Specification {
    def "Fuel Calculations"() {
        expect:
        new FuelCalculator().calculateFuel(masses) == result

        where:
        masses || result
        [12] || 2
        [14] || 2
        [1969] || 654
        [100756] || 33583
    }
}
