package day4work3;

public class SaleManager implements SaleService {

	@Override
	public void sell(Gamer gamer, Campaign campaign, Game game) {
		System.out.println(gamer.getFirstName() + " adl� oyuncu " + game.getName() +"  oyununu" 
				 +campaign.getCampaignName() + "  kampanyayla oyunu sat�n ald�"); 
					 System.out.println(campaign.getCampaignRate() + " indirim uyguland�");
					 
		
	}

}
