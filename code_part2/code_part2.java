public class Test {
	
	public class Employee {
		
		private String name;
		private int hours;
		private double rate;
		private Address[] addresses;
		
		public Employee(String name, int hours, double rate, Address[] addresses) { // Employee constructor with parameters
			this.name = name;
			this.hours = hours;
			this.rate = rate;
			this.addresses = addresses;
		}
		
		public Employee() { // Employee constructor without parameters
			this.name = null;
			this.hours = null;
			this.rate = null;
			this.addresses = new Address[6];
		}
		
		public setName(String name) { // sets Employee name
			this.name = name;
		}
		
		public setHours(int hours) { // sets Employee hours
			this.hours = hours;
		}
		
		public setRate(double rate) { // sets Employee rate
			this.rate = rate;
		}
		
		public setAddressList(Address[] addresses) { // takes an array of addresses as input and sets Employee addresses
			this.addresses = addresses;
		}
		
		public setAddressAtIndex(Address address, int index) {
			addresses[index] = address;
		}
		
		public getName() {
			return name;
		}
		
		public getHours() {
			return hours;
		}
		
		public getRate() {
			return rate;
		}
		
		public getAddressAtIndex(int index) {
			return addresses[i];
		}
		
	}
	
	public class Address {
		
		private String street;
		private int number;
		private String postal;
		
		public Address(String street, int number, String postal) {
			this.street = street;
			this.number = number;
			this.postal = postal;
		}
		
		public setStreet(String street) {
			this.street = street;
		}
		
		public setNumber(int number) {
			this.number = number;
		}
		
		public setPostal(String postal) {
			this.postal = postal;
		}
		
		public String getStreet() {
			return street;
		}
		
		public int getNumber() {
			return number;
		}
		
		public String getPostal() {
			return postal;
		}
		
	}
	
	
	public static void main(String[] args) {
		
		
		
	}
	
}