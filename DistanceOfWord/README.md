# Distanceofword
# Ашиглах сан
#1. jwnl14-rc2
#2. jawjaw-1.0.2.jar
#3. ws4j-1.0.1.jar
# Ашиглах өгөгдөл
#1. wn20_bc.csv
# Функцийн тайлбар
#1. Main.java
##1.1 Эцсийн үр дүнг харуулах(үг хоорондын зай)
#2. WordDistance.java 
##2.1  WordDistance - Wordnet db - ийн бэлэн сан
##2.1 compute - Хоёр үг өгөхөд тухайн үгйин зайг олох
    Wordnet - ийн өөрийнх нь сангийн үг зайг олох функц
#3. WordReadFile.java
##3.1 WordReadFile - Байгуулагч функц
##3.2 fileToList - Файлд байгаа бүх үг болон векторыг зөвхөн үгийг жагсаалт болгон хувиргах
##3.3 isString - Glove.txt дотор байгаа үг болон тухайн үгийн вектор утгуудаас үг мөн эсэхийг олох
##3.4 listToDistance - Жагсаалт дотор байгаа бүх үгийн ( n!/(c-k)! * k! ) хослолын distance-ийг олох