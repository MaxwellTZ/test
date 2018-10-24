# Get a page from a website

from urllib import urlopen

site = urlopen("http://www.reflections.co.nz")

for line in site.readlines():
    line = line.strip()
    print line
    
site.close()

print 


