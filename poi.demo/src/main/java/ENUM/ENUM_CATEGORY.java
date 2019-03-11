package ENUM;

public enum ENUM_CATEGORY {
	LASTWEEK(1,"�����������"),
	NEXTWEEK(2,"���ܼƻ�����"),
	COST(3,"�ɱ�����");
	private final Integer code;
    private final String desc;

    ENUM_CATEGORY(Integer code ,String desc) {
        this.code = code;
        this.desc = desc;
    }

    public Integer code() {
        return code;
    }

    public String desc() {
        return desc;
    }
}
