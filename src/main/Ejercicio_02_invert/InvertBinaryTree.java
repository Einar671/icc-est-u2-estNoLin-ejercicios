package main.Ejercicio_02_invert;

import main.Materia.Models.Node;

public class InvertBinaryTree {
    private Node root;

    public InvertBinaryTree(){
        this.root=null;
    }

    public Node invertTree(Node nodo) {
    if (nodo == null) {
        return null;
    }

    Node temp = nodo.getLeft();
    nodo.setLeft(invertTree(nodo.getRight()));
    nodo.setRight(invertTree(temp));

    return nodo;
}

}
