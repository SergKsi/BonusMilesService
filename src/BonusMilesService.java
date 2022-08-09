public class BonusMilesService {
    public int calculate(int cost) {
        int result;
        int countRubBonusMiles = 20; // количество рублей для одной бонусной милли

        // формула расчета :
        // за каждые 20 рублей, потраченные на билет, начисляется 1 миля.
        result = (cost * 1) / countRubBonusMiles;
        return result;
    }

}
