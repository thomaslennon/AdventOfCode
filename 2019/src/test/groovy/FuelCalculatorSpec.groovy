import ie.tomlennon.aoc.day1.FuelCalculator;

class FuelCalculatorSpec extends spock.lang.Specification {
    def "Fuel Calculations"() {
        expect:
        new FuelCalculator().calculateFuel(masses) == result

        where:
        masses || result
        [12] || 2
        [14] || 2
        [12, 14]| 4
        [12, 14, 12] | 6
        [1969] || 654
        [100756] || 33583
    }
}
