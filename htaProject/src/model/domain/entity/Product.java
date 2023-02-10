package model.domain.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.ToString;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor

@Getter
@Setter
@ToString

@Entity
public class Product {
	@Id
	@NonNull
	private String p_id;
	
	@NonNull
	private String p_name;
	
	@ManyToOne
	@JoinColumn(name = "c_id")
	@NonNull
	private Category category; //category ���̺��� c_id �÷����� ���� �����ϴ� �÷��̴� ���� category������ product�� id���� ���εǼ� �����. ī�װ� ��ü�ε� ī�װ� ��ü�� id������ ���εǼ� ����.
	
	@NonNull
	private Integer p_price;
	
	@NonNull
	private String p_info;
	
	@NonNull
	private String p_img;
	
	@NonNull
	private String p_stock;
	
	@OneToMany(mappedBy = "product")
	@NonNull
	private List<Cart> cart = new ArrayList<Cart>();
	
}
