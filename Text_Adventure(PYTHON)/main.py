print("You wake up one beautiful morning to a letter stapled to the door!")
print("You grab it and start walking into town, enjoying the fresh air!")
name = input("Enter your calling card: ")
print("You open the letter..")
print("Congratulations ",name," you have been selected to fight for the Kingdom of Crusalia.")
print("You are to report to the nearest soilder to start training.")
print("Welcome to the rest of your life.")

choice = input("Go to soilder? (yes/no): ")
while True:
    if choice == "yes":
        print("You chose a life of death and will probably die...")
        break
    if choice == "no":
        print("You run for your life!")
        print("The soilder see you and chase after you!")
        choice = input("What do you do? (run/hide/give up): ")
        if choice == "run":
            print("You continue running!")
            print("Suddenly you here a shot fired, you fall to the ground!")
            print("Bleading out.. You died.. Better than the military maybe?")
            break
        if choice == "hide":
            print("You jump head first into the bushes!")
            print("Barely dodging the soilders as they sprint past you..")
            print("You escaped for now..")
            choice = input("What do you do? (stay/scan/sleep): ")
            if choice == "stay":
                print("You stay put, thinking to yourself..")
                choice = input("Do i really just stay here? (yes/no): ")
                if choice == "yes":
                    print("Hm.. i guess so..")
                    print("Waiting longer.. ")
                    print("You stare into the abyss waiting..")
                    print("You die of boredom..")
                    break
                if choice == "no":
                    choice = input("What should i do? (scan/sleep?): ")
                    if choice == "scan":
                        print("You scan the surrounding area..")
                        print("You see the soilders coming back from the direction they chased you..")
                        print("Talking amongst themselves: 'Damn he ran fast, he wouldve been a good soilder..'")
                        print("The other responding: 'Yeah, i wonder where he ran off too..")
                        print("They pass you and you see an opening to be able to run away! ")
                        choice = input("What do you do? (wait/run): ")
                        if choice == "wait":
                            print("You make a concious decision to wait and see what the surrounding tells you.")
                            print("You notice the tree above you is swaying quite a lot and it seems it could fall at any moment.")
                            choice = input("What do you do? (run/death): ")
                            if choice == "run":
                                print("You jump out of the bushes and cheses the opening!")
                                print("Suprisingly no one notices you..")
                                print("Congratulations!")
                                print("You escaped the military!")
                                break
                            if choice == "death":
                                print("You stay.. and welcome the branch on your head..")
                                print("You close your eyes and wait, hearing the branch snap..")
                                print("Well.. youre alive. It seems to have missed..")
                                print("You celebrate! Alerting the guards to your presence and they capture you..")
                                print("lol..")
                                break
                            else:
                                print("No valid response added..")
                                print("You wait too long and the tree above the bush you are hiding under falls..")
                                print("It smacks you in the head..")
                                print("I guess thats it..")
                                break
                        if choice == "run":
                            print("You jump out of the bushes and cheses the opening!")
                            print("Suprisingly no one notices you..")
                            print("Congratulations!")
                            print("You escaped the military!")
                            break
                        else:
                            print("No valid response recorded.. ")
                            print("You wait too long and the tree above the bush you are hiding under falls..")
                            print("It smacks you in the head..")
                            print("I guess thats it..")
                            break
                else:
                    print("No valid choice recorded..")
                    print("I guess thats it, you loose..")
                    break
            if choice == "scan":
                print("You scan the surrounding area..")
                print("You see the soilders coming back from the direction they chased you..")
                print("Talking amongst themselves: 'Damn he ran fast, he wouldve been a good soilder..'")
                print("The other responding: 'Yeah, i wonder where he ran off too..")
                print("They pass you and you see an opening to be able to run away! ")
                choice = input("What do you do? (wait/run): ")
                if choice == "wait":
                    print("You make a concious decision to wait and see what the surrounding tells you.")
                    print("You notice the tree above you is swaying quite a lot and it seems it could fall at any moment.")
                    choice = input("What do you do? (run/death): ")
                    if choice == "run":
                        print("You jump out of the bushes and cheses the opening!")
                        print("Suprisingly no one notices you..")
                        print("Congratulations!")
                        print("You escaped the military!")
                        break
                    if choice == "death":
                        print("You stay.. and welcome the branch on your head..")
                        print("You close your eyes and wait, hearing the branch snap..")
                        print("Well.. youre alive. It seems to have missed..")
                        print("You celebrate! Alerting the guards to your presence and they capture you..")
                        print("lol..")
                        break
                    else:
                        print("No valid response added..")
                        print("You wait too long and the tree above the bush you are hiding under falls..")
                        print("It smacks you in the head..")
                        print("I guess thats it..")
                        break
                if choice == "run":
                    print("You jump out of the bushes and cheses the opening!")
                    print("Suprisingly no one notices you..")
                    print("Congratulations!")
                    print("You escaped the military!")
                    break
                else:
                    print("No valid response recorded.. ")
                    print("You wait too long and the tree above the bush you are hiding under falls..")
                    print("It smacks you in the head..")
                    print("I guess thats it..")
                    break
            if choice == "sleep":
                print("You decide to lay down and try and sleep..")
                print("Being exhausted you fall asleep instantly..")
                print("You start snoring loudly.. the soilders fin you..")
                print("They shake you awake and take you to their officer..")
                print("He puts you into the program, you become cannon fodder..")
                print("You live about 3 days before the war catches up to you..")
                break
            else:
                print("No valid response inputted..")
                print("You fall asleep anyway..")
                print("Get bitten by a black widow spider.. seem they exist..")
                print("Dying slowly through your sleep..")
                print("The soilders find you the next day..")
                break

        if choice == "give up":
            print("You raise your hands and yell: 'I Give UP'")
            print("The soilders capture you and take you to the military camp..")
            print("Because you tried to run, the officer decide to hang you..")
            print("Youll be an example for other people..")
            print("At least you had a purpose?")
            break
        else:
            print("You didnt write a valid response..")
            print("Since the choice wassnt clear, the soilders just walk over to you and take you in..")
            print("Welcome to the school of cannon-fodder.")
            break
    else:
        print("You didnt enter a valid response.")
        print("You just stand there, looking lost.")
        print("I guess youll stay here for a while...")
        break