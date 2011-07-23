package wrmsys;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

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

	public JuiceType(Long juiceTypeId, String juiceName, String juiceColor,
			String juiceDescription) {
		super();
		this.juiceTypeId = juiceTypeId;
		this.juiceName = juiceName;
		this.juiceColor = juiceColor;
		this.juiceDescription = juiceDescription;
	}

	public JuiceType() {

	}

	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private Long juiceTypeId;

	private String juiceName;

	private String juiceColor;

	private String juiceDescription;
}
