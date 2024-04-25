import { useState } from "react";
import axios from "axios";
import {
  Text,
  Input,
  Stack,
  NumberInput,
  NumberInputField,
  NumberInputStepper,
  NumberIncrementStepper,
  NumberDecrementStepper,
  Image,
  Card,
  Button,
  Flex,
  Center,
} from "@chakra-ui/react";
import Swal from "sweetalert2";

function App() {
  const [date, setDate] = useState("");
  const [smallDogsQuantity, setSmallDogsQuantity] = useState(0);
  const [bigDogsQuantity, setBigDogsQuantity] = useState(0);

  const fetchBestPrice = async () => {
    try {
      const response = await axios.get(
        `http://localhost:8080/api/v1/petshops/bestPrice`,
        {
          params: {
            date: date,
            smallDogsQuantity: smallDogsQuantity,
            bigDogsQuantity: bigDogsQuantity,
          },
        }
      );
      Swal.fire({
        title: "Melhor PetShop",
        text: `O melhor PetShop para levar seus cãezinhos é o " ${response.data.petShopName} " e o total dos banhos é R$${response.data.totalPrice},00 .`,
        icon: "success",
        confirmButtonColor: "#4682B4",
        confirmButtonText: "OK",
      });
    } catch (error) {
      console.error("Erro ao buscar o melhor preço:", error);
    }
  };

  const handleSubmit = (e: React.FormEvent<HTMLFormElement>) => {
    e.preventDefault();
    fetchBestPrice();
  };

  return (
    <Flex height="100vh" align="center" justify="center" bg="#F5F5F5">
      <Card maxW="500px">
        <Stack spacing={6} align="center" mt={8}>
          <Text fontSize="3xl" color="#363636">
            Canil do Senhor Eduardo
          </Text>

          <Center>
            <Image
              boxSize="60%"
              src="/logo.png"
              alt="Imagem Canil Senhor Eduardo"
            />
          </Center>
          <form onSubmit={handleSubmit}>
            <Flex align="center">
              <Text fontSize="md" color="#4F4F4F" mr={2}>
                Data
              </Text>
              <Input
                required
                type="date"
                variant="outline"
                placeholder="Outline"
                mb={3}
                w="230px"
                onChange={(e) => setDate(e.target.value)}
              />
            </Flex>

            <Flex align="center">
              <Text fontSize="md" color="#4F4F4F" mr={2}>
                Cães Pequenos
              </Text>
              <NumberInput
                defaultValue={0}
                onChange={(value) => setSmallDogsQuantity(parseInt(value))}
                mb={3}
              >
                <NumberInputField />
                <NumberInputStepper>
                  <NumberIncrementStepper />
                  <NumberDecrementStepper />
                </NumberInputStepper>
              </NumberInput>
            </Flex>

            <Flex align="center">
              <Text fontSize="md" color="#4F4F4F" mr={2}>
                Cães Grandes
              </Text>
              <NumberInput
                defaultValue={0}
                onChange={(value) => setBigDogsQuantity(parseInt(value))}
              >
                <NumberInputField />
                <NumberInputStepper>
                  <NumberIncrementStepper />
                  <NumberDecrementStepper />
                </NumberInputStepper>
              </NumberInput>
            </Flex>

            <Center>
              <Button colorScheme="blue" mt={4} mb={4} type="submit">
                Encontrar melhor PetShop
              </Button>
            </Center>
          </form>
        </Stack>
      </Card>
    </Flex>
  );
}

export default App;
