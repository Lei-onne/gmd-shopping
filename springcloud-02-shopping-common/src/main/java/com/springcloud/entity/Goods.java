package com.springcloud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Goods���Ӧ��ʵ���࣬���ڱ������һ����Ʒ����Ϣ
 * 
 * @author ����
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Goods implements java.io.Serializable {

	private static final long serialVersionUID = 5550168279140722620L;

	/**
	 * ��Ʒ���
	 */
	private Integer goodsId;

	/**
	 * ��Ʒ����
	 */
	private String goodsName;

	/**
	 * ��Ʒ�۸�
	 */
	private Double goodsPrices;

	/**
	 * ��Ʒ�ۿۼ�
	 */
	private Double goodsDiscount;

	/**
	 * ��Ʒ״̬��0Ϊ�ϼܣ�1Ϊ�¼�
	 */
	private Integer goodsStatus;

	/**
	 * ��Ʒ����
	 */
	private Integer goodsCount;

	/**
	 * �Ƿ���Ʒ��0Ϊ��Ʒ��1Ϊ����Ʒ
	 */
	private Integer goodsIsNew;

	/**
	 * �Ƿ�������0Ϊ������1Ϊ������
	 */
	private Integer goodsIsHot;

	/**
	 * ��Ʒ����0Ϊ�1Ϊһ�㣬2Ϊ����
	 */
	private Integer goodsLevel;

	/**
	 * ��Ʒ���
	 */
	private String goodsBrief;

	/**
	 * ��Ʒ����
	 */
	private String goodsDetails;

	/**
	 * ��ƷͼƬ
	 */
	private String goodsPhoto;

	/**
	 * �������
	 */
	private Integer class2Id;

	/**
	 * ��ѯ��������Ʒ�۸�����
	 */
	private Double goodsPriceMin;

	/**
	 * ��ѯ��������Ʒ�۸�����
	 */
	private Double goodsPriceMax;

	/**
	 * ��ѯ�������Լ����ͱ��
	 */
	private Integer class1Id;
	
	/**
	 * ��Ʒ���������ڱ���ͳ�Ʒ���Ľ��
	 */
	private Integer goodsSum;
}