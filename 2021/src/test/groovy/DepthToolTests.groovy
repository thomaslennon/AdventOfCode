import ie.tomlennon.aoc.day1.DepthTool

class DepthToolTests extends spock.lang.Specification {
    def "Dept Tool Test" () {
        expect:
        DepthTool.countIncreases(depths) == result

        where:
        depths || result
        [199, 200,208,210 ,200 ,207 ,240 ,269 ,260 ,263 ] || 7
    }

}
