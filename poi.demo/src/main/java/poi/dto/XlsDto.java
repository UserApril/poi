package poi.dto;

import java.util.Date;

public class XlsDto {
	//��������
	private String type;
	//��������
	private String name;
	//��ʼʱ��
	private Date stardate;
	//����ʱ��
	private Date enddate;
	//��ʱ
	private int days;
	//������
	private String dutyperson;
	//��ɱ���
	private double lv;
	//�ͻ������
	private String desc;
	
	@Override
	public String toString() {
		return "XlsDto [type=" + type + ", name=" + name + ", stardate=" + stardate + ", enddate=" + enddate + ", days="
				+ days + ", dutyperson=" + dutyperson + ", lv=" + lv + ", desc=" + desc + "]";
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + days;
		result = prime * result + ((desc == null) ? 0 : desc.hashCode());
		result = prime * result + ((dutyperson == null) ? 0 : dutyperson.hashCode());
		result = prime * result + ((enddate == null) ? 0 : enddate.hashCode());
		long temp;
		temp = Double.doubleToLongBits(lv);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((stardate == null) ? 0 : stardate.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		XlsDto other = (XlsDto) obj;
		if (days != other.days)
			return false;
		if (desc == null) {
			if (other.desc != null)
				return false;
		} else if (!desc.equals(other.desc))
			return false;
		if (dutyperson == null) {
			if (other.dutyperson != null)
				return false;
		} else if (!dutyperson.equals(other.dutyperson))
			return false;
		if (enddate == null) {
			if (other.enddate != null)
				return false;
		} else if (!enddate.equals(other.enddate))
			return false;
		if (Double.doubleToLongBits(lv) != Double.doubleToLongBits(other.lv))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (stardate == null) {
			if (other.stardate != null)
				return false;
		} else if (!stardate.equals(other.stardate))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getStardate() {
		return stardate;
	}
	public void setStardate(Date stardate) {
		this.stardate = stardate;
	}
	public Date getEnddate() {
		return enddate;
	}
	public void setEnddate(Date enddate) {
		this.enddate = enddate;
	}
	public int getDays() {
		return days;
	}
	public void setDays(int days) {
		this.days = days;
	}
	public String getDutyperson() {
		return dutyperson;
	}
	public void setDutyperson(String dutyperson) {
		this.dutyperson = dutyperson;
	}
	public double getLv() {
		return lv;
	}
	public void setLv(double lv) {
		this.lv = lv;
	}
	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}
	
	
	
	
}
