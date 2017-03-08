package test
import java.util.List
import org.codehaus.groovy.runtime.InvokerHelper

class TestProgram {
	static void main(String[] args)
	{
		def firstname = 'john'
		def lastname = 'Doe'
		def a = 3
		def b = 7
		def evenList = [12,3,4,5,6,7,8,9,21,32,45]
		def list = [] // declaring the list
		list<<1 // adding elements to the list
		list<<2	// adding elements to the list
		list<<3	// adding elements to the list
		
		println "This is the groovy Project"
		println "Hello world"
		
		println "${firstname} ${lastname}"	
		println "a+b = ${a+b}"
		
		println "$list"
		
		println list[1] // individual accessing of elements in the list
		println "size of list = ${list.size()}" // we can get all the elements in the list by using size() function
	
		
		
		println evenList.findAll{it % 2 == 0}
		println evenList.collect{it * 2}
		
		def map = [fruit:'Apple']
		map['car'] = 'sedan'
		println map
		println map.get('car')
		5.times {
			println 'hello'
			}
		
		//looping through items of a list 
		println 'looping through items of a list'
		['cat','dog', 'hamster'].each {name -> println name }
		
		println 'getting values from range'
		(0..5).each{number -> println number}
		
		println 'looping through map'
		[fruit:'Apple', veggie:'carrot',car:'sedan'].each { key , value -> println "${key} = ${value}"
		}
		
	}
}
