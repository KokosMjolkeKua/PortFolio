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
