package day4work3;

public class CampaignManager implements CampaignService {

	@Override
	public void add(Campaign campaign) {
		 System.out.println(campaign.getCampaignName()+" i�in ge�erli"+  campaign.getCampaignRate()+"  oran�nda kampanya eklenmi�tir");
		
	}

	@Override
	public void update(Campaign campaign) {
		 System.out.println(campaign.getCampaignName()+" i�in ge�erli"+  campaign.getCampaignRate()+"  oran�nda kampanya g�ncellenmi�tir.");
		   
		
	}

	@Override
	public void delete(Campaign campaign) {
		 System.out.println(campaign.getCampaignName()+" i�in ge�erli"+  campaign.getCampaignRate()+"  oran�nda kampanya silinmi�tir.");
		   
		
	}
	

}
