String srch= 'http://www.google.com?name=johny&age=20&hobby=cricket'
def var=srch.tokenize('?')
def key
var.each{ 
 key=it.split('&')
}
key.each{ 
 println it
}