# Conversor de Monedas

## Descripción
El Conversor de Monedas es una aplicación en Java que permite convertir cantidades entre múltiples monedas. La conversión se realiza a partir de códigos de moneda estándar (por ejemplo, USD, JPY). El programa es robusto y puede manejar entradas con mayúsculas, minúsculas y espacios en blanco sin generar errores.

## Funcionalidades
- **Conversión de múltiples monedas**: Soporta la conversión entre varias monedas usando sus códigos de tres letras (ISO 4217).
- **Entrada flexible**: Permite la entrada de códigos de moneda en mayúsculas, minúsculas y con espacios en blanco.
- **Manejo de errores**: Si se introduce un código de moneda incorrecto o una cantidad no válida, el programa lanza una excepción y permite al usuario intentar de nuevo.
- **Interacción continua**: Después de una conversión exitosa, el usuario puede optar por realizar otra conversión o terminar el programa.
- **Historial de conversiones**: Al finalizar, se genera un archivo JSON con el historial de todas las conversiones realizadas durante la sesión.

## Uso
1. **Inicio del programa**: Al ejecutar el programa, se solicita al usuario que ingrese el código de la moneda base, el código de la moneda de destino y la cantidad a convertir.
2. **Entrada de datos**: El usuario puede ingresar los códigos de moneda en cualquier combinación de mayúsculas y minúsculas, así como con espacios en blanco.
3. **Conversión**: El programa realiza la conversión y muestra el resultado.
4. **Continuar o terminar**: El usuario decide si desea realizar otra conversión o finalizar el programa.
5. **Generación de historial**: Si el usuario decide finalizar, se crea un archivo JSON con el historial de conversiones.

## Ejemplo de Uso
```plaintext
Ingrese la moneda base (por ejemplo, USD): usd
Ingrese la moneda de destino (por ejemplo, jpy): JPY
Ingrese la cantidad a convertir: 100

Conversion: La conversion de 100.00 USD a JPY es de 16162.49 JPY

Si desea salir del programa, digite la palabra: salir
Si desea seguir convirtiendo presione la tecla enter
```

# Notas
Intente cubrir la mayoria de errores que pueda tener un usuario al intentar convertir entre monedas, puede que se me haya escapado alguna validacion, pero creo haber solucionado la mayoria de errores que puedan haber.
Ademas, intente hacer que el codigo fuera lo mas limpio posible, aunque estoy consciente que hay margenes de mejora, aunque puse en practica todo lo aprendido en los cursos y siento que fue satisfactorio.
