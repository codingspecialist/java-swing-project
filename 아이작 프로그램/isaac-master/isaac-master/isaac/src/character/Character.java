package character;



import javax.swing.JFrame;

import bullet.BulletControl;
import lombok.Data;
import objectSize.ViewDirect;

@Data

public class Character {
	private JFrame app;
	private final static String GUBUN = "Character : ";
	private double life, maxLife;		// 생명, 최대 생명력
	private double attackDamge;	// 공격
	private int viewDirect; // 1 : 아래, 2: 왼쪽, 3: 위쪽, 4 : 오른쪽
	private boolean isUp, isDown, isRight, isLeft;	// 키를 눌렸는지 안눌렸는지 체크
	private int xChar, yChar;	// 캐릭터 label위치
	private int xCenter, yCenter;	// 캐릭터 중심
	private boolean dead;
	private BulletControl bulletControl;	// bullet 제어
	private boolean moveStart = false;
	private boolean isAttacking = false;
	
	
	public Character(JFrame app) {
		this.app = app;
		isUp = false;
		isDown = false;
		isRight = false;
		isLeft = false;
		dead = false;
	}
	public void moveRight() {}
	public void moveLeft() {}
	public void moveUp() {}
	public void moveDown() {}
	public void moveMotion() {}
	public void isDeadCheck() {}
	public void dead() {}
	public void attack() {}
	
	
	
}
