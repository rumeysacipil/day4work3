package day4work3;

public class GameManager implements GameService {

	@Override
	public void add(Game game) {
		System.out.println(game.getName()+" oyun eklendi");
	
	}

	@Override
	public void update(Game game) {
		  System.out.println(game.getId()+" oyun g�ncellendi");
	}

	@Override
	public void delete(Game game) {
		 System.out.println(game.getId()+" oyun silindi");
		
	}

	@Override
	public void discount(Game game, Campaign campaign) {
		double discount=game.getPrice()-(game.getPrice()*campaign.getCampaignRate())/100;
		   System.out.println(game.getName()+" adl� oyunun yeni fiyat�:"+discount);
	}

}
