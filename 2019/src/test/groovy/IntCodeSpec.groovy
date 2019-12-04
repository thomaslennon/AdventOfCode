import ie.tomlennon.aoc.day2.IntcodeComputer

class IntCodeSpec extends spock.lang.Specification {
    def "Calculate"() {
        expect:
        new IntcodeComputer().calculateFuel(masses) == result

        where:
        masses      || result
        [12]        || 2
        [14]        || 2
        [12, 14]     | 4
        [12, 14, 12] | 6
        [1969]      || 654
        [100756]    || 33583
    }

}
