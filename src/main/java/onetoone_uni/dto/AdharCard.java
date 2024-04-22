package onetoone_uni.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class AdharCard {
	@Id
	private int id;
	private String name;
	private String address;

}
