from my_enum import Enum
class Country(Enum):
    Albania = 355
    Algeria = 213
    Andorra = 376
    Angola = 244
    Antarctica = 672
for data in Country:
    print('{:15} = {}'.format(data.name, data.value))
print('Country Name ordered by Country Code:')
print('\n'.join('  ' + c.name for c in sorted(Country)))