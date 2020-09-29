package ex05;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;


@Accessors(fluent=false,chain=true)
@Getter
@Setter
@NoArgsConstructor
public class Product<T, M> {

	private T kind;
	private M model;
	
//	// Getters
//	public T getKind() {
//		return this.kind;
//	} // getKind
//	
//	public M getModel() {
//		return this.model;
//	} // getModel
//	
//	// Setters
//	public void setKind(T kind) {
//		this.kind = kind;
//	} // setKind
//	
//	public void setModel(M model) {
//		this.model = model;
//	} // setModel
} // end class
