import pytest
import time # Trying to Import time to add a delay in the program (aestetic reasons)

print("Health App Loading..")

time.sleep(3) # Pauses the program for 3 seconds
name:str=input(f"Enter your name:  ")

def greet(name):
	"""
	Health App Greeting,
	Takes the input of the user as a variable
	Prints f-strings
	"""
	try:
		name = float(name)
		"""
		Raising TypeError 
		to make sure the input is string.
		If the input can be converted to a float, it
		will give an error
		"""
		raise TypeError(f"The input is expected to be a String, and is returning: {type(name)}")
	except ValueError:
		print(f"Health App Setup Complete!")
		print(f"Hello {name}, welcome to your health tracker!")
			

greet(name)


def track_sleep():
	"""
	Function to track the users sleep,
	looking at the amount of hours and 
	measuring up towards what is a healhty standard.
	"""
	hours=(input("How many hours did you sleep:  "))
	try:
		hours=float(hours)
		if hours < 8:
			print(f"With only {hours} hours of sleep, you will have less cognitive function and physical restoration than the average adult..")
		elif hours > 7 and hours < 11:
			print(f"With {hours} hours of sleep, you will restore your cognitive ability to a full, and restore your physical ability!")
		else:
			print(f"This is very good.. but there is a thing as too much sleep as well, if {hours} is your average..")		
	except ValueError:
		print(f"Error: '{hours}' is not a valid number.")

track_sleep()		