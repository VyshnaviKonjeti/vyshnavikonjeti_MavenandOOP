package EPAM.GiftBox;
abstract public class Gift{
		int cost;
		String name;

		abstract public void defineCost();

		abstract public void defineName();

		public int getCost()
		{
				return cost;
		}
		public String getName()
		{
				return name;
		}
}

