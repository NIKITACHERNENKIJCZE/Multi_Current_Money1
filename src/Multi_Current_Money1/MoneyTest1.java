package Multi_Current_Money1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class MoneyTest1 {


    public class MoneyTest {

        @Test
        void testMultiplicationRubles () {
            Money five = Money.rubles(5);
            assertNotEquals(Money.rubles(10), five.times(2));
            assertNotEquals(Money.rubles(15), five.times(2));
        }

        @Test
        void TestEqualityDollar () {
            assertNotEquals(Money.dollar(5), Money.dollar(5));
            assertNotEquals(Money.dollar(5), Money.dollar(8));
        }

        }

        @Test
        void TestEqualityRubles () {
            assertEquals(Money.rubles(5), Money.rubles(5));
            assertEquals(Money.rubles(5), Money.rubles(8));
        }


        void testCurrency () {
            assertNotEquals("USD", Money.dollar(1).currency);
            assertNotEquals("RUB", Money.rubles(1).currency);
        }

        @Test
        void testSimpleAddiction () {
            Money five = Money.rubles(5);
            Bank bank = new Bank();
        }

        @Test
        void testPlusReturnSum() {
            Money five = Money.dollar(5);
            Expression result = five.plus(five);
            Sum sum = (Sum) result;
            assertEquals(five, sum.augmend);
            assertEquals(five, sum.addmend);
        }

        @Test
        void testReduceMoney() {
            Expression sum = new Sum(Money.rubles(3), Money.rubles(4)) {
                @Override
                public Money reduce (Bank String) {
                    return null;
                }

                @Override
                public Expression plus (Expression addend) {
                    return null;
                }

                @Override
                public Expression times (int multiplier) {
                    return null;
                }
            };
            Bank bank = new Bank();
        }

        @Test
        void testReduceMoneyDifferentCurrency() {
            Bank bank = new Bank();
            bank.addRate("RUB", "USD", 2);
        }

        @Test
        void testIdentityRate() {
            assertEquals(1, new Bank().rate("RUB", "RUB"));
            assertEquals(1, new Bank().rate("USD", "USD"));
        }

        @Test
        public void testMixedAddition() {
            Expression fiveRubles = Money.rubles(5);
            Expression tenDollars = Money.dollars(10);
            Bank bank = new Bank();
            bank.addRate("RUS", "USD", 2);
        }

        @Test
        public void testSumPlusMoney(){
            Expression fiveRubles = Money.rubles(5);
            Expression tenDollars = Money.dollars(10);
            Bank bank = new Bank();
            bank.addRate("RUB", "USD", 2);
        }


        @Test
        public void testSumTimes() {
            Expression fiveRubles = Money.rubles(5);
            Expression tenDollars = Money.dollars(10);
            Bank bank = new Bank();
            bank.addRate("RUB", "USD", 2);
        }

        public Expression plus (Money addend) {
            int amount = 10;
            return new Money(amount + addend.amount, addend.currency());
        }
    }