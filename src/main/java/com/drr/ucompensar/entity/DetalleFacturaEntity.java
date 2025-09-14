package com.drr.ucompensar.entity;

import java.io.Serializable;
import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "detalle_factura")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DetalleFacturaEntity implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_detail;
	
	private Integer cantidad;
	
	@Column(name="precio_unit")
	private BigDecimal precioUnidad;
	
	@ManyToOne
	@JoinColumn(name = "id")
	private FacturaEntity factura;
	
	@ManyToOne
    @JoinColumn(name = "id_prod")
    private ProductoEntity producto;

}
