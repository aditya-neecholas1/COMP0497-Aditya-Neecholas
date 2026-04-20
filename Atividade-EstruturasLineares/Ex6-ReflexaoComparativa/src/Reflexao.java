/*
Questão a)
Porque, ao inserir no meio do array, precisamos deslocar os outros elementos posteriores,
processo que possui complexidade O(n), enquanto que a inserção no meio de uma lista encadeada
apenas possui complexidade O(1), visto que apenas modificamos os ponteiros de referência 
entre os nós.

Questão b)
O array dinâmico é mais eficiente, pois apenas com o índice podemos obter instantaneamente
 a informação armazenada no dito espaço de memória, processo que possui complexidade O(1). 
 Já em listas encadeadas, precisamos percorrer a lista desde o head, 
 seguindo os ponteiros sequencialmente, processo que possui complexidade O(n), 
 já que percorreremos n nós.

Questão c)
Sim, seria possível resolver o problema de Josephus com um array. A remoção seria feita 
deslocando todos os elementos posteriores ao elemento removido para trás. Esse processo
seria muito menos eficiente do que com a utilização de uma lista circular, pois teríamos
que repetidamente repetir o processo de deslocamento dos elementos mencionado anteriormente,
o que possuíria complexidade de O(n²), dado que, no pior dos casos teríamos O(n) para a
remoção de elementos e consequente deslocamento de elementos (nesse caso, caso fosse o primeiro
elemento), o que, multiplicado a O(n -1), que constitui o número de operações necessárias para
que reste apenas um elemento, resulta em O(n/²).
*/