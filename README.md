# Proyecto Conversor de Monedas

En este repositorio se presenta un conversor de monedas con **Java** como parte de un *challenge* de Back-End de AluraLatam (en colaboración con Oracle). En el proyecto se hace una práctica de consumo de una API 
para obtener el valor de cada moneda tomando otra moneda como referencia, con el objetivo de obtener el valor de un cambio de moneda en diferentes divisas. 
Para la realización del proyecto, se consumió la API de [ExchangeRate-Api](https://www.exchangerate-api.com) obteniendo un archivo `JSON` y extrayendo la respectiva información
correspondiente a la moneda ingresada.

## Información

<p>Para la lectura de la API solicitada se hizo uso de la biblioteca `Gson` desarrollada por **Google** y, posteriormente, se extrajeron los datos correspondientes al diccionario 
`conversion_rates` para hacer la respectiva conversión de divisas. El programa consta de un texto de bienvenida al usuario, en el cual se dan diferentes opciones de conversión
de diferentes divisas, que son las siguientes:

![input](https://github.com/SebasM2000/conversor-de-monedas-challenge-alura/assets/111396043/3cb172f9-bf29-4811-adaf-3e42696ba41b)

En dicha entrada, se inserta el número que corresponde a la opción deseada. Posteriormente, se digita el saldo que el usuario desea convertir y se muestra el resultado en pantalla,
junto con el mismo menú mostrado anteriormente. Es decir, las opciones de conversión de moneda se muestran de manera indefinida hasta que el usuario especifique de manera explícita 
que quiere salir del programa (escribiendo 7 en el Input). Un ejemplo de una equivalencia de divisas de muestra a continuación.

![image](https://github.com/SebasM2000/conversor-de-monedas-challenge-alura/assets/111396043/56ee17f2-1778-4406-b4a4-cd2b3d8ffcc2)

En la salida del programa, se especifica el código ISO de cada divisa. Sin embargo, por el momento el tipo de divisa está limitado a las opciones que se muestran en las imágenes.
Se espera que en momentos posteriores se amplíe a cualquier tipo de moneda disponible en la API, y que sea el usuario que digite de manera libre los tipos de moneda a convertir
especificando su código ISO.
