package wrmsys;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

@PersistenceCapable(identityType=IdentityType.APPLICATION)
public class JuiceType {
	public Long getJuiceTypeId() {
		return juiceTypeId;
	}

	public void setJuiceTypeId(Long juiceTypeId) {
		this.juiceTypeId = juiceTypeId;
	}

	public String getJuiceName() {
		return juiceName;
	}

	public void setJuiceName(String juiceName) {
		this.juiceName = juiceName;
	}

	public String getJuiceColor() {
		return juiceColor;
	}

	public void setJuiceColor(String juiceColor) {
		this.juiceColor = juiceColor;
	}

	public String getJuiceDescription() {
		return juiceDescription;
	}

	public void setJuiceDescription(String juiceDescription) {
		this.juiceDescription = juiceDescription;
	}

	public JuiceType(String juiceName, String juiceColor,
			String juiceDescription) {
		super();
		this.juiceName = juiceName;
		this.juiceColor = juiceColor;
		this.juiceDescription = juiceDescription;
	}

	public JuiceType() {

	}

	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private Long juiceTypeId;
	@Persistent
	private String juiceName;
	@Persistent
	private String juiceColor;
	@Persistent
	private String juiceDescription;
}
