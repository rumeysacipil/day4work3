package day4work3;

public class GamerManager implements GamerService {

	@Override
	public void register(Gamer gamer) {
		System.out.println(gamer.getFirstName()+gamer.getLastName()+" ba�ar�l� bir �ekilde kaydolunmu�tur.");
		
	}

	@Override
	public void update(Gamer gamer) {
		
		System.out.println(gamer.getFirstName()+gamer.getLastName()+" ba�ar�l� bir �ekilde g�ncellendi.");
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println(gamer.getFirstName()+gamer.getLastName()+" ba�ar�l� bir �ekilde silindi.");
	}

}
