package com.example.rarnoldmobile.classes;

public enum EnumType {

	SUNDAY 		(0),
	MONDAY 		(1),
	TUESDAY		(2),
	WEDNESDAY	(3),
	THURSDAY	(4),
	FRIDAY		(5),
	SATURDAY	(6);
	
	private final Integer dayIndex;
	
	EnumType(Integer _dayIndex) {
		this.dayIndex = _dayIndex;
	}
	
	@SuppressWarnings("unused")
	private Integer dayIndex() { return dayIndex;}
	
	public Integer getDayIndex() {
		return this.dayIndex;
	}
}
