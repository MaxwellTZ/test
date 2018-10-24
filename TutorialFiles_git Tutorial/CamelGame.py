import random

print("Welcome to Camel!")
print("You have stolen a camel to make your way across the great Mobi desert.")
print("The natives want their camel back and are chasing you down!")
print("Survive your desert trek and outrun the natives.")

miles_traveled = 0
thirst = 0
camel_tiredness = 0
natives_distance = -20
Drinks_in_canteen = 3

done = False
while not done:
    print("")
    print("A. Drink from your canteen.")
    print("B. Ahead moderate speed.")
    print("C. Ahead full speed.")
    print("D. Stop for the night.")
    print("E. Status check.")
    print("Q. Quit.\n")

    user_choice = input("Your choice?\n").upper()

    if user_choice == "Q":
        done = True

    elif user_choice == "E":
        print("Miles traveled: %d" % miles_traveled)
        print("Drinks in canteen: %d" % Drinks_in_canteen)
        print("The natives are %d miles behind you." % (miles_traveled - natives_distance))

    elif user_choice == "D":
        camel_tiredness = 0
        print("The camel is happy!")
        natives_distance += random.randrange(7, 15)

    elif user_choice == "C":
        x = random.randrange(10, 21)
        miles_traveled += x
        print("You have traveled " + str(x) + " miles")
        thirst += 1
        camel_tiredness += random.randrange(1, 4)
        natives_distance += random.randrange(7, 15)

    elif user_choice == "B":
        y = random.randrange(5, 13)
        miles_traveled += y
        print("You have traveled " + str(y) + " miles")
        thirst += 1
        camel_tiredness += random.randrange(0, 2)
        natives_distance += random.randrange(7, 15)

    elif user_choice == "A":
        if Drinks_in_canteen > 0:
            Drinks_in_canteen += -1
            thirst = 0
        else:
            print("You have no more drinks!")

    if not done and thirst > 4:
        if thirst > 6:
            print("You died of thirst")
            done = True
        else:
            print("You are thirsty")

    if not done and camel_tiredness > 5:
        if camel_tiredness > 8:
            print("Your camel is dead")
            done = True
        else:
            print("Your camel is getting tired")

    if not done and (miles_traveled - natives_distance) < 15:
        if (miles_traveled - natives_distance) == 0:
            print("You have been caught by the natives!")
            done = True
        else:
            print("The natives are getting close!")

    if not done and miles_traveled >= 200:
        print("You made it across the desert! You win.")
        done = True

    if not done and (user_choice == "A" or user_choice == "B"):
        z = random.randrange(1, 21)
        if z == 1:
            print("You found and oasis!")
            Drinks_in_canteen = 3
            thirst = 0
            camel_tiredness = 0