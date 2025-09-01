
    [4, 5, 6],
    [7, 8, 9]
]

# Función para buscar un valor en la matriz
def buscar_valor(matriz, valor):
    for i in range(len(matriz)):
        for j in range(len(matriz[i])):
            if matriz[i][j] == valor:
                return (i, j)  # Retorna la posición (fila, columna)
    return None  # Retorna None si no lo encuentra

# Valor a buscar
valor_a_buscar = 5

# Llamar a la función
posicion = buscar_valor(matriz, valor_a_buscar)

# Mostrar el resultado
if posicion:
    print(f"El valor {valor_a_buscar} se encontró en la posición {posicion}.")
else:
    print(f"El valor {valor_a_buscar} no se encontró en la matriz.")

}