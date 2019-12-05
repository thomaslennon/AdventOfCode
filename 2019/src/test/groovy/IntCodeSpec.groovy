import ie.tomlennon.aoc.day2.IntcodeComputer

class IntCodeSpec extends spock.lang.Specification {
    def "Calculate"() {
        expect:
        new IntcodeComputer().calculate(codes) == result

        where:
        codes      || result
        [1,9,10,3,2,3,11,0,99,30,40,50]        || [3500,9,10,70,2,3,11,0,99,30,40,50]
        [1,0,0,0,99] || [2,0,0,0,99] //(1 + 1 = 2)
        [2,3,0,3,99] || [2,3,0,3,99] //(3 * 2 = 6)
        [2,4,4,5,99,0] || [2,4,4,5,99,9801] //(99 * 99 = 9801).
        [1,1,1,4,99,5,6,0,99] || [30,1,1,4,2,5,6,0,99]

    }

}
