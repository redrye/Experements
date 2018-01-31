/* Project 2 execise 5 */

parent(jill,bill).
parent(sarah,bill).
parent(sam,jill).
parent(ana,jill).
parent(jan,sarah).
parent(smith,sarah).
grandparent(X,Z):- parent(X,Y), parent(Y,Z).
sibling(X,Y):- parent(X,Z), parent(Y,Z), X\=Y.
cousin(X,Y):- (grandparent(X,Z),
              grandparent(Y,Z),
              \+sibling(X,Y),
              X\=Y; write("No cousin")).
