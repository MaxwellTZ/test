import os, os.path, sys

def showMenu(heading, itemlist):
    while True:
        print ("\n *** " + heading + " ***\n")
        for i in range(len(itemlist)):
            print ("%4d: %s" % (i, itemlist[i]))

        print("\n Choice (or 'q')", end= " ")
        reply = input(": ")
        if reply in ['q', 'Q']:
            return None
        else:
            try:
                option = int(reply)
                if 0 <= option < len(itemlist):
                    return option
            except:
                pass


def pickAFile(thisDir = ['.'], extension = '*'):
    namesInThisDir = os.listdir(thisDir)

    filelist = []
    for item in namesInThisDir:
        fullname = os.path.join(thisDir, item)
        # fullname = item
        if os.path.isfile(fullname) and \
              (item.endswith(extension) or extension == '*'):
            filelist.append(item)
    filelist.sort()
    choice = showMenu("Pick a file", filelist)
    if choice is not None:
        return os.path.join(thisDir, filelist[choice])
    else:
        return None


if __name__ == "__main__":
    while True:
        choice = pickAFile('.', '*')
        if choice:
            print("You chose", choice)
        else:
            sys.exit(0)
