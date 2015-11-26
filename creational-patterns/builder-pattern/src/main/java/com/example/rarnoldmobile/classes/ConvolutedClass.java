package com.example.rarnoldmobile.classes;

public class ConvolutedClass {


	private String color;
	private String shape;
	private String name;
	
	@SuppressWarnings("unused")
	private String argument1;
	
	@SuppressWarnings("unused")
	private String argument2;
	
	@SuppressWarnings("unused")
	private String argument3;
	
	private ConvolutedClass(Builder builder) {
		color 		= builder.color;
		shape 		= builder.shape;
		name 		= builder.name;
		argument1 	= builder.argument1;
		argument2 	= builder.argument2;
		argument3 	= builder.argument3;
	}
	
	public String toString() {
		return "Name: " + this.name + ", color: " + this.color + ", shape: " + this.shape;
	}
	
	public static class Builder {
		
		//Initialize parameters with default values
		private String color 		= "Red";
		private String shape 		= "Square";
		private String name 		= "Test";
		private String argument1 	= "hello";
		private String argument2    = "is it me";
		private String argument3    = "you're looking for";
		
		public Builder() {
			
		}
		
		public Builder withColor(String i_color) {
			color = i_color;
			return this;
		}
		
		public Builder withShape(String i_shape) {
			shape = i_shape;
			return this;
		}
		
		public Builder withName(String i_name) {
			name = i_name;
			return this;
		}
		
		public Builder withArgument1(String i_argument1) {
			argument1 = i_argument1;
			return this;
		}
		
		public Builder withArgument2(String i_argument2) {
			argument2 = i_argument2;
			return this;
		}
		
		public Builder withArgument3(String i_argument3) {
			argument3 = i_argument3;
			return this;
		}
		
		public ConvolutedClass build() {
			return new ConvolutedClass(this);
		}

	}
}
